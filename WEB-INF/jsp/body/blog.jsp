<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row blog-item col-xs-18 col-sm-12 col-md-12 hide blog">
	<div class="row">
		<div class="image col-xs-18 col-sm-4 col-md-4">
			<a
				href="${pageContext.request.contextPath}/blog/detail">
				<img src='<c:url value="/resources/images/blog/test_blog.jpg"/>' />
			</a>
		</div>
		<div class="blog-sub-content col-xs-18 col-sm-8 col-md-8">
			<a
				href="${pageContext.request.contextPath}/blog/detail"><h3>How
					to Tell if a Dentist Is Serious About Cosmetic Dentistry</h3></a>
			<p>
				For cosmetic dentistry, you want a cosmetic dentist. Seems simple
				enough, but here’s the problem: any dentist can call themselves a
				“cosmetic dentist.” So how do you tell the dentists who <a
					href="${pageContext.request.contextPath}/blog/detail">[...]</a>
			</p>
		</div>

	</div>
	<div class="author col-xs-18 col-sm-12 col-md-12 row">
		<span>By <a
			href="${pageContext.request.contextPath}/about/hengLim">Dr. Heng
				Lim, D.D.S. </a><span>|</span><span class="date"> May 26th, 2016</span> <a
			class="read-more"
			href="${pageContext.request.contextPath}/blog/detail">read
				more</a>
	</div>

</div>





<script type="text/javascript"
	src='<c:url value="/resources/js/body/blog.js"/>'></script>


