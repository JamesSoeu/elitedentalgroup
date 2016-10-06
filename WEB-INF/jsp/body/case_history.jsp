<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row case-history-text-note col-xs-18 col-sm-12 col-md-12 ">
	<p>
		These are most cases history of our patients which show about his or
		her feeling after got our service.
	</p>
</div>

<div class="row case-item col-xs-18 col-sm-12 col-md-12 case-history hide">
	<a href="#">
		<div class="thumbnail col-xs-18 col-sm-4 col-md-4">
			<div class="embed-responsive embed-responsive-16by9">
				<iframe class="embed-responsive-item"
					allowfullscreen="allowfullscreen"
					mozallowfullscreen="mozallowfullscreen"
					msallowfullscreen="msallowfullscreen"
					oallowfullscreen="oallowfullscreen"
					webkitallowfullscreen="webkitallowfullscreen"
					src="https://www.youtube.com/embed/bxOJ2k2KtDQ"></iframe>
			</div>
			<div class="caption">
				<span>Mr.Ung Stephen (Oologah)</span>
			</div>
		</div>
	</a>
	<div class="case-sub-content col-xs-18 col-sm-8 col-md-8">
		<a
			href="${pageContext.request.contextPath}/caseHistory/detail?title=Neck Pain"><h3>Neck
				Pain</h3></a>
		<p>
			I was got headaches all most everyday since I was 15 years old. I
			used to go to hospital to met the doctor, but they couldn't fixer up.
			It has suffered from Sleep Apnea for many years<a
				href="${pageContext.request.contextPath}/caseHistory/detail?title=Neck Pain">
				[...]</a>
		</p>
	</div>

</div>


<script type="text/javascript"
	src='<c:url value="/resources/js/body/case_history.js"/>'></script>
