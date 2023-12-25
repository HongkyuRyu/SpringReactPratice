package com.hongkyu.boardback.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.hongkyu.boardback.common.ResponseCode;
import com.hongkyu.boardback.common.ResponseMessage;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 모든 Response는 Code와 Message를 가진다.

@Getter
@AllArgsConstructor
public class ResponseDto {
    
    private String code;
    private String message;

    public static ResponseEntity<ResponseDto> databaseError() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }
}
