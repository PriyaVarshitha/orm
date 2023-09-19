<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/WEB-INF/dropdown.tld" prefix="ish" %>
<%@ page import="com.jstl.Dropdown" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Custom Tag Example</title>
</head>
<body>
    <h1>Custom JSP Tag Example</h1>

    <ish:list tableName="trains" columnName="trn_start" />

   
</body>
</html>
