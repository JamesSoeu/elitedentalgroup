<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link href="<c:url value="/resources/css/slideshow/pgwslider.css" />"
	rel="stylesheet">
<script type="text/javascript"
	src='<c:url value="/resources/js/slideshow/pgwslider.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/body/office.js"/>'></script>

<div class="slide-photos col-xs-18 col-sm-12 col-md-12">

	<ul class="pgwSlider">
		<li><img src="<c:url value="/resources/images/office/2.JPG"/>"
			alt="Entry Room"
			data-description=""></li>
		<li><img src="<c:url value="/resources/images/office/1.JPG"/>"
			alt="Reception Room" data-description="It is very comfortable."/></li>
		<li><img src="<c:url value="/resources/images/office/9.JPG"/>">
			<span>Reception Room</span></li>
		<li><img src="<c:url value="/resources/images/office/3.JPG"/>">
			<span>Business Office</span></li>
		<li><img src="<c:url value="/resources/images/office/4.JPG"/>">
			<span>Consult Room</span></li>
		<li><img src="<c:url value="/resources/images/office/5.JPG"/>"
			alt="Treatment Room" data-description="Eiffel Tower and Champ de Mars"/></li>
		<li><img src="<c:url value="/resources/images/office/6.JPG"/>"
			alt="Hall"/></li>
		<li><img src="<c:url value="/resources/images/office/7.JPG"/>">
			<span>Hall</span></li>
		<li><img src="<c:url value="/resources/images/office/8.JPG"/>">
			<span>Relaxing Room</span></li>

	</ul>

</div>
<div class="office-content-wraper col-xs-18 col-sm-12 col-md-12 ">

	<div class="office-content col-xs-18 col-sm-12 col-md-12">
		<p>
			Our Team at Elite Dental Group is set a part from your average dental
			team. From the moment you walk through our doors our friendly, caring
			staff and our spa like atmosphere will make you feel at home. Our
			Knowledgeable, attentive team will make you feel like part of the
			family.</p>
	</div>
</div>
<script type="text/javascript">
	jQuery(function($) {
		/* 	pgwSlider.reload({
			    maxHeight : 1000,
			    intervalDuration : 4000
			});
		 */
		var pgwSlider = $('.pgwSlider').pgwSlider();
		pgwSlider.reload({
			maxHeight : 500,
			intervalDuration : 4000,
			verticalCentering : true,
			transitionDuration : 700,
			displayControls : true,
		});
	});
</script>
<script type="text/javascript"
	src="<c:url value='/resources/js/body/office.js' />"></script>
