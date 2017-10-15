<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h4>所有老师信息</h4>
    <s:if test="#request.teachers==null||#request.teachers.size()==0">
        没有老师信息！
    </s:if>
    <s:else>
      <table boder="1" cellpadding="10" cellspacing="0">
        <tr>
           <td>ID</td>
           <td>USER_NAME</td>
           <td>PASSWORD</td>
           <td>TRUE_NAME</td>
           <td>CLASS_NO</td>
           <td>TEL</td>
        </tr>
       <s:iterator value="#request.teachers">
       <tr>
           <td>${id }</td>
           <td>${username }</td>
           <td>${password }</td>
           <td>${realname }</td>
           <td>${classno }</td>
           <td>${tel }</td>
        </tr></s:iterator>
      </table>
    </s:else>
    
    
</body>
</html>