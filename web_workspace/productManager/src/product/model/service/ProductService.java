package product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import product.exception.ProductException;
import product.model.dao.ProductDao;
import product.model.dto.Product;

public class ProductService {
	ProductDao pd = new ProductDao();
	public ArrayList<Product> selectAll() throws ProductException{
		Connection conn=null;
		conn = getConnection();
		ArrayList<Product> list = pd.selectAll(conn);
		close(conn);
		return list;
	}
	public Product selectRow(String p_id) throws ProductException{
		Connection conn=null;
		conn = getConnection();
		Product pct = pd.selectRow(conn, p_id);
		close(conn);
		return pct;
	}
	public ArrayList<Product> selectName(String p_name) throws ProductException{
		Connection conn=null;
		conn = getConnection();
		ArrayList<Product> list = pd.selectName(conn, p_name);
		close(conn);
		return list;
	}
	public int insertRow(Product p) throws ProductException{
		Connection conn=null;
		conn = getConnection();
		int result = pd.insertRow(conn, p);
		close(conn);
		return result;
	}
	public int updateRow(Product p) throws ProductException{
		Connection conn=null;
		conn = getConnection();
		int result = pd.updateRow(conn, p);
		close(conn);
		return result;
	}
	public int deleteRow(Product p) throws ProductException{
		Connection conn=null;
		conn = getConnection();
		int result = pd.deleteRow(conn, p);
		close(conn);
		return result;
	}
}
