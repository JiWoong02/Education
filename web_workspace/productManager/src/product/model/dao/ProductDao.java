package product.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import product.exception.ProductException;
import product.model.dto.Product;

public class ProductDao {
	private Properties prop = new Properties();
	public ProductDao() {
		try {
			prop.load(new FileReader("resources/query.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Product> selectAll(Connection conn) throws ProductException{
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Product pct = null;
		ArrayList<Product> list =new ArrayList<Product>();
		try {
			pstmt=conn.prepareStatement(prop.getProperty("selectall"));
			rset = pstmt.executeQuery();
			while(rset.next()) {
				pct = new Product();
				pct.setProduct_id(rset.getString(1));
				pct.setP_name(rset.getString(2));
				pct.setPrice(rset.getInt(3));
				pct.setDescription(rset.getString(4));
				list.add(pct);
			}
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	public Product selectRow(Connection conn, String p_id) throws ProductException {
		Product pct = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt=conn.prepareStatement(prop.getProperty("selectone"));
			pstmt.setString(1, p_id);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				pct = new Product();
				pct.setProduct_id(rset.getString(1));
				pct.setP_name(rset.getString(2));
				pct.setPrice(rset.getInt(3));
				pct.setDescription(rset.getString(4));
			}
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		return pct;
	}
	public ArrayList<Product> selectName(Connection conn, String p_name) throws ProductException {
		Product pct = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Product> list = null;
		try {
			pstmt=conn.prepareStatement(prop.getProperty("selectname"));
			pstmt.setString(1, "%"+p_name+"%");
			rset = pstmt.executeQuery();
			list = new ArrayList<Product>();
			while(rset.next()) {
				pct = new Product();
				pct.setProduct_id(rset.getString(1));
				pct.setP_name(rset.getString(2));
				pct.setPrice(rset.getInt(3));
				pct.setDescription(rset.getString(4));
				list.add(pct);
			}
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	public int insertRow(Connection conn, Product p) throws ProductException {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt=conn.prepareStatement(prop.getProperty("insert"));
			pstmt.setString(1, p.getProduct_id());
			pstmt.setString(2, p.getP_name());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getDescription());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(pstmt);
		}
		return result;
	}
	public int updateRow(Connection conn, Product p) throws ProductException {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt=conn.prepareStatement(prop.getProperty("update"));
			
			pstmt.setInt(1, p.getPrice());
			pstmt.setString(2, p.getProduct_id());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(pstmt);
		}
		return result;
	}
	public int deleteRow(Connection conn, Product p) throws ProductException {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt=conn.prepareStatement(prop.getProperty("delete"));
			
			pstmt.setString(1, p.getProduct_id());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new ProductException(e.getMessage());
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	
}
