package com.ahmed.secoopecproductnetwork.common;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.sound.sampled.AudioFileFormat;
import java.time.LocalDateTime;
@EntityListeners(AudioFileFormat.class)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntite {
    @Id
    @GeneratedValue
    private int id;
    @CreatedDate
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdDATE;
    @org.springframework.data.annotation.LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime LastModifiedDate;
    @CreatedBy
    @Column(nullable = false,updatable = false)
    private Integer createdBy;
    @org.springframework.data.annotation.LastModifiedBy
    @Column(insertable = false)
    private Integer LastModifiedBy;

}
