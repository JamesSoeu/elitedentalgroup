<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link href="<c:url value="/resources/css/swipe/photoswipe.css"/>"
	type="text/css" rel="stylesheet" />

<script type="text/javascript"
	src='<c:url value="/resources/js/swipe/klass.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/swipe/code.photoswipe-3.0.5.js"/>'></script>
<div class=" awards col-xs-18 col-sm-12 col-md-12">

	<ul id="Gallery" class="gallery">
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/lvi_logo.png"/>"><img
					src="<c:url value="/resources/images/awards/lvi_logo.png"/>"
					alt="lvi logo" /></a></li>
		</div>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/get certificate.JPG"/>"><img
					src="<c:url value="/resources/images/awards/get certificate.JPG"/>"
					alt="get certificate" /></a></li>
		</div>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/american acedamic dentistry.png"/>"><img
					src="<c:url value="/resources/images/awards/small/american acedamic dentistry_small.png"/>"
					alt="american acedamic dentistry" /></a></li>
		</div>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/joint national comission examination.JPG"/>"><img
					src="<c:url value="/resources/images/awards/small/joint commision of national examination_small.png"/>"
					alt="joint commision of national examination" /></a></li>
		</div>

		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/pratice dentistry.png"/>"><img
					src="<c:url value="/resources/images/awards/small/pratice dentistry _small.png"/>"
					alt="pratice dentistry" /></a></li>
		</div>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/prosthetic and surgical curriculum.JPG"/>"><img
					src="<c:url value="/resources/images/awards/small/prosthetic and surgical curriculum_small.png"/>"
					alt="prosthetic and surgical curriculum" /></a></li>
		</div>

		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/student achievement award in indodontics.JPG"/>"><img
					src="<c:url value="/resources/images/awards/small/student achievement award in indodontics_small.png"/>"
					alt="student achievement award in indodontics" /></a></li>
		</div>

		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/outstanding professional multicultural Achievment Award.png"/>"><img
					src="<c:url value="/resources//images/awards/outstanding professional multicultural Achievment Award.png"/>"
					alt="Award 01" /></a></li>
		</div>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<li><a
				href="<c:url value="/resources/images/awards/wester regional examining.png"/>"><img
					src="<c:url value="/resources/images/awards/wester regional examining.png"/>"
					alt="Award 08" /></a></li>
		</div>

	</ul>
</div>
<script type="text/javascript">
	(function(window, PhotoSwipe) {

		document.addEventListener('DOMContentLoaded', function() {

			var options = {}, instance = PhotoSwipe.attach(window.document
					.querySelectorAll('#Gallery a'), options);

		}, false);

	}(window, window.Code.PhotoSwipe));
</script>
