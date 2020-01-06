package com.axia.copartner.base;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@Component
public class BaseApiService<T> {


	public BaseResponse<T> setResultError(Integer code, String msg) {
		return setResult(code, msg, null);
	}


	public BaseResponse<T> setResultError(String msg) {
		return setResult(Constants.HTTP_RES_CODE_500, msg, null);
	}


	public BaseResponse<T> setResultSuccess(T data) {
		return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
	}


	public BaseResponse<T> setResultSuccess(List<T> dtoList) {
		return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
	}


	public BaseResponse<T> setResultSuccess(String msg) {
		return setResult(Constants.HTTP_RES_CODE_200, msg, null);
	}


	public BaseResponse<T> setResult(Integer code, String msg, T data) {
		return data == null ?  new BaseResponse<T>(code, msg) :  new BaseResponse<T>(code, msg, data);
	}

	public Boolean toDaoResult(int result) {
		return result > 0 ? true : false;
	}

}
