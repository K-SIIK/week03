package com.sparta.assignment.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter // get 함수 자동 생성
@MappedSuperclass // 상속했을 때 테이블의 column 이 되도록 함
@EntityListeners(AuditingEntityListener.class) // 변경되었을 때 자동으로 기록
public abstract class TimeStamped {

    @CreatedDate // 최초 생성 시점
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 변경 시점
    private LocalDateTime updatedAt;
}

