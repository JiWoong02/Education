package org.ict.boot_react.member.jpa.repository;

import org.ict.boot_react.common.SearchDate;
import org.ict.boot_react.member.jpa.entity.MemberEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberRepositoryCustom {
    //jpa 가 제공하지 않는 기능을 작동시키기 위한 메서드 추가함
    MemberEntity findByUserId(String userId);   // 회원가입시 아이디 중복 확인


    //관리자용 검색 관련
    long searchIDCount(String keyword);
    long searchGenderCount(String keyword);
    long searchAgeCount(int age);
    long searchDateCount(SearchDate searchDate);
    long searchLoginOKCount(String keyword);

    List<MemberEntity> findBySearchUserId(String keyword, Pageable pageable);
    List<MemberEntity> findBySearchGender(String userId, Pageable pageable);
    List<MemberEntity> findBySearchAge(int age, Pageable pageable);
    List<MemberEntity> findBySearchEnrollDate(SearchDate searchDate, Pageable pageable);
    List<MemberEntity> findBySearchLoginOK(String keyword, Pageable pageable);
    int updateLoginOK(String userId, String loginOK);





}
