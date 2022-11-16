<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="category" scope="request" type="com.ute.jspservlettutorial.beans.Category"/>
<jsp:useBean id="categories" scope="request" type="java.util.List<com.ute.jspservlettutorial.beans.Category>"/>

<t:main>
	<jsp:body>
		<div class="card">
				<%--			<h5 class="card-header">Category</h5>--%>
				<%--			<div class="card-body">--%>
				<%--				${category.catID} + ${category.cateName}--%>
				<%--			</div>--%>
			<h5 class="card-header">Categories</h5>
			<div class="card-body">
				<table class="table table-hover">
					<thead>
					<tr>
						<th>#</th>
						<th>Category</th>
						<th>&nbsp;</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${categories}" var="c">
						<tr>
							<td>${c.catID}</td>
							<td>-${c.cateName}</td>
							<td>
								<button type="submit"></button>
							</td>
						</tr>
					</c:forEach>

					</tbody>
				</table>


			</div>
			<div class="card-footer text-muted">
				2 months ago!
			</div>

		</div>
	</jsp:body>
</t:main>