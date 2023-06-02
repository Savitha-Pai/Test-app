//package com.rs.test.entity;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.MappedSuperclass;
//import lombok.Data;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Data
//@MappedSuperclass
//public class BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @CreatedDate
//    @Column(name = "created_at",nullable=false, insertable = true, updatable = false, columnDefinition="datetime default current_timestamp")
//    private Date createdAt;
//
//    @LastModifiedDate
//    @Column(name = "updated_at",nullable=false, insertable = true, updatable = true, columnDefinition="datetime default current_timestamp")
//    private Date updatedAt;
//
//    @PrePersist
//    protected void onCreate() {
//        createdAt = updatedAt = new Date();
//    }
//
//    @PreUpdate
//    protected void onUpdate() {
//        updatedAt = new Date();
//    }
//
//}
