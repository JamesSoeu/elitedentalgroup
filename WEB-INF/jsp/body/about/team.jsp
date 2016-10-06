<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="team-container">

	<div>
		<img src="<c:url value="/resources/images/about/teamwork.jpg"/>" />
	</div>
	<div class="row person-infor">
		<div class="col-xs-18 col-sm-5 col-md-5">
			<%-- <a href="${pageContext.request.contextPath}/about/hengLim"><img
				class=""
				src="<c:url value="/resources/images/about/dr lim profile.jpg"/>"
				alt="Dr.Heng Lim Image"/> </a> --%>
				<a href="${pageContext.request.contextPath}/about/hengLim">
					<img src="<c:url value='/resources/images/about/drLimProfile.jpg'/>" alt="Dr.Heng Lim Profile"/>
				</a>
		</div>
		<div class="col-xs-18 col-sm-7 col-md-7 sub-detail-info">
			<h4>Dr.Heng Lim, D.D.S.; LVIF</h4>
			<ul>
				<li>Tel: <a href="tel:918274-3779 ">(918) 274-3779 </a></li>
				<li>Email: <a href="mailto:smileowasso@gmail.com">smileowasso@gmail.com</a></li>
			</ul>
			<p>
				Dr. Lim is a 1994 graduate of the University of Oklahoma College of
				Dentistry of which he was the award recipient of "The Most
				Outstanding Asian American." Dr. Lim is also a graduate of the "Las
				Vegas Institute for Advanced Studies... <a
					href="${pageContext.request.contextPath}/about/hengLim"><button
						type="button" class="btn btn-info">more</button></a>
			</p>
		</div>
	</div>
	<div class="row person-infor">
		<div class="col-xs-18 col-sm-5 col-md-5">
					<img src="<c:url value='/resources/images/about/Joyce Ward.JPG'/>" alt="Joyce Ward Profile"/>
		</div>
		<div class="col-xs-18 col-sm-7 col-md-7 sub-detail-info">
			<h4>Joyce Ward</h4>
			<h5>Dental Concierge</h5>
			<p>My name is Joyce. I am the dental concierge here at Elite
				Dental Group. I will more than likely be the first person to greet
				you when you come for your dental appointment. I have worked with
				Doctor Lim for over 17 years. I have the utmost respect for him and
				all he stands for. The atmosphere here is God-honoring, and I am
				humbled that I am able to work alongside a dental team who has such
				passion to help others. Give me a call. I would love to assist you
				in any way I can.</p>
		</div>
	</div>
	<div class="row person-infor">
		<div class="col-xs-18 col-sm-5 col-md-5">
					<img src="<c:url value='/resources/images/about/Keri Davidson.JPG'/>" alt="Keri Davidson Profile"/>
		</div>
		<div class="col-xs-18 col-sm-7 col-md-7 sub-detail-info">
			<h4>Keri Davidson</h4>
			<h5>Dentist's Assistance</h5>
		</div>
	</div>
	<div class="row person-infor">
		<div class="col-xs-18 col-sm-5 col-md-5">
		<%-- 	<a href="#"><img class=""
				src="<c:url value="/resources/images/about/DrHengLim.jpeg"
				alt="Dr.Heng Lim Image"/>"> </a> --%>
		</div>
		<div class="col-xs-18 col-sm-7 col-md-7 sub-detail-info">
			<h4>Dr. Heng L Lim DDS</h4>
			<p>Dr. Lim is a 1994 graduate of the University of Oklahoma
				College of Dentistry of which he was the award recipient of "The
				Most Outstanding Asian American." Dr. Lim is also a graduate of the
				"Las Vegas Institute for Advanced Studies...</p>
		</div>
	</div>
	<div class="row person-infor">
		<div class="col-xs-18 col-sm-5 col-md-5">
		<%-- 	<a href="#"><img class=""
				src="<c:url value="/resources/images/about/DrHengLim.jpeg"
				alt="Dr.Heng Lim Image"/>"> </a> --%>
		</div>
		<div class="col-xs-18 col-sm-7 col-md-7 sub-detail-info">
			<h4>Dr. Heng L Lim DDS</h4>
			<p>Dr. Lim is a 1994 graduate of the University of Oklahoma
				College of Dentistry of which he was the award recipient of "The
				Most Outstanding Asian American." Dr. Lim is also a graduate of the
				"Las Vegas Institute for Advanced Studies...</p>
		</div>
	</div>
</div>





<script type="text/javascript"
	src='<c:url value="/resources/js/body/team.js"/>'></script>
