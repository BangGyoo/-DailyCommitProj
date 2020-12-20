package com.commit.daily.repository.dto;

public class Member {
/*
CREATE TABLE `member` (
	id varchar(30) PRIMARY KEY comment '아이디',
	access_token varchar(50) NOT NULL UNIQUE comment '로그인 인증 값',
	name varchar(30) comment '이름',
	api_url varchar(100) comment 'api사용을 위한 url',
	html_url varchar(100) comment '사용자 메인 깃허브 페이지'
) comment '깃허브 인증방식을 이용한 멤버 테이블';
 */
	private String  id;
	private String name;
	private String apiUrl;
	private String htmlUrl;
	private String accessToken;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApiUrl() {
		return apiUrl;
	}
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	public String getHtmlUrl() {
		return htmlUrl;
	}
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", apiUrl=" + apiUrl + ", htmlUrl=" + htmlUrl + ", accessToken="
				+ accessToken + "]";
	}
	
	
	
}
