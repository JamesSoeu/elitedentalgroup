
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="banner col-xs-18 col-sm-12 col-md-12 fixed-margin-top">
	<div class="container">
		<div class="col-xs-18 col-sm-8 col-md-8">
			<div class="embed-responsive embed-responsive-16by9">
				<iframe class="embed-responsive-item"
					src="https://www.youtube.com/embed/POcEWa0nvLQ?autoplay=1"></iframe>
			</div>
		</div>
		<div class="banner-text col-xs-18 col-sm-4 col-md-4">
			<h2>A changed smile</h2>
			<h3>is a</h3>
			<h2>changed life !</h2>
			<a href="${pageContext.request.contextPath}/contact#request-form"
				class="btn btn-primary" role="button">Make Appointment</a>
			<!-- 	<h4>
				with
				</h4>
				<h2>Dr. Lim</h2> -->

		</div>
	</div>

</div>
<div class="cases-experience col-xs-18 col-sm-12 col-md-12">
	<div class="left col-sm-3 col-md-3">
		<%-- 	<img alt="Image"
			src="<c:url value="/resources/images/left-home.png"/>"> --%>
	</div>
	<div class="middle col-xs-18 col-sm-6 col-md-6">
		<h2>Do you have any of these symptoms?</h2>
		<div class="symptoms">
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Headaches or Migraines</a> 
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Ear Pain or Ear Congestion</a> 
			
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Neck Pain</a> 
			<a href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Jaw Locking</a>
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Fibromyalgia</a>
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Vertigo or Dizziness</a> 
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Cervical Dystonia</a> 
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">GENERALIZED
				ANXIETY</a>
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">TMJ Joints Pain</a> 
			<a
				href="${pageContext.request.contextPath}/service/detail?title=TMJ%20Pain%20Relief&serviceId=20160727084112589">Clicking and Popping TM Joints</a> 
		</div>
	</div>
	<div class="right col-sm-3 col-md-3">
		<%-- <img alt="Image"
			src="<c:url value="/resources/images/right-home.png"/>"> --%>
	</div>

</div>
<div class="service-promote col-xs-18 col-sm-12 col-md-12 ">
	<div class="container">

		<div class="page-header">
			<div id="page-header-left">
				<h2>Our Popular Services</h2>
				<a href="${pageContext.request.contextPath}/service"><h3>More
						Services&#187&#187</h3></a>
			</div>
			<%-- <div id="page-header-right">
			<a href="${pageContext.request.contextPath}/service"><h2
				id="service-more">Next More...</h2></a></div> --%>
		</div>


		<div class="col-sm-4 col-md-4 col-xs-18">
			<div class="thumbnail">
				<a
					href="${pageContext.request.contextPath}/service/detail?title=Cosmetic Dentistry&serviceId=20160803102022010">
					<img
					src="<c:url value="/resources/images/service/cosmestic dentistry-small.jpg"/>"
					alt="Image">
					<div class="caption">
						<h4>Cosmetic Dentistry</h4>
					</div>
				</a>
			</div>
		</div>
		<div class="col-xs-18 col-sm-4 col-md-4">
			<div class="thumbnail">
				<a
					href="${pageContext.request.contextPath}/service/detail?title=Implant & Full-Mouth-Reconstruction&serviceId=20160811155657729">
					<img src="<c:url value="/resources/images/service/implant.JPG"/>"
					alt="...">
					<div class="caption">
						<h4>Implant & Full-Mouth-Reconstruction</h4>
					</div>
				</a>
			</div>
		</div>
		<div class="col-xs-18 col-sm-4 col-md-4">
			<div class="thumbnail">
				<a
					href="${pageContext.request.contextPath}/service/detail?title=Neuromuscular Dentistry - TMJ / TMD Treatment&serviceId=20160727084112589">
					<img
					src="<c:url value="/resources/images/service/tmj/Henry Janer.JPG"/>"
					alt="...">
					<div class="caption">
						<h4>TMJ Pain Relief</h4>
					</div>
				</a>
			</div>
		</div>

	</div>
</div>



<div class="col-xs-18 col-sm-12 col-md-12" id="form-request-home">
	<form id="defaultForm" method="post" class="form-horizontal "
		action="<c:url value="/api/form-request"/>">
		<div
			class="request-form-horizontal-wraper col-xs-18 col-sm-12 col-md-12 ">
			<a name="request-form"></a>
			<div class="request-form-wraper container">
				<div class="row">
					<div class="page-header col-xs-18 col-sm-12 col-md-12">
						<h3>Would love to hear from you</h3>
					</div>
				</div>
				<div class="row request-form-horizontal">
					<div class="col-xs-18 col-sm-4 col-md-4">
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<select name="wouldLike" id="would-like"
								class="combobox form-control">
								<option disabled selected>I would like to ...</option>
								<option value="PUR001">Schedule an appointment</option>
								<option value="PUR002">Consultation</option>
								<option value="PUR003">Request general information</option>
							</select>
						</div>
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<select name="interested" id="interested"
								class="combobox form-control">
								<option disabled selected>I am interested in ...</option>
								<option value="I005">General Dentistry</option>
								<option value="I004">Implants</option>
								<option value="I001">TMJ</option>
								<option value="I007">Cosmetic/smile Makeover</option>
								<!-- <option value="I002">FMR/ NSF</option> -->
								<option value="I003">Dentures</option>
								<!-- 	<option value="I006">Filling upgrade</option> -->
								<option value="I008">Other</option>
							</select>
						</div>
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<select name="bestTime" id="best-time"
								class="form-control combobox">
								<option disabled selected>Best Time to Contact ...</option>
								<option value="BT001">No Preference</option>
								<!-- <option value="BT002">Don't call me</option> -->
								<option value="BT003">8:00 am - 1:00 pm</option>
								<option value="BT004">2:00 pm - 5:00 pm</option>
							</select>
						</div>
					</div>

					<div class="col-xs-18 col-sm-4 col-md-4">
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<input type="text" name="firstName" id="first-name"
								placeholder="First Name" class="form-control" />
						</div>
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<input type="text" name="lastName" id="last-name"
								placeholder="Last Name" class="form-control" />
						</div>
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<input type="tel" name="phoneNumber" id="phone-number"
								placeholder="Phone Number" class="form-control" />
						</div>
					</div>

					<div class="col-xs-18 col-sm-4 col-md-4">
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<input type="email" name="email" id="email"
								placeholder="Email (optional)" class="form-control" />
						</div>
						<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">
							<textarea rows="4" cols="46" name="message" id="message-to-us"
								placeholder="Message to Us (optional)" class="form-control"></textarea>
						</div>

					</div>
				</div>
				<div class="row col-xs-18 col-sm-12 col-md-12 submit">
					<button type="submit" class="btn btn-primary" id="btn-submit">Send
						Now</button>
				</div>
			</div>
		</div>

	</form>
</div>
<div class="col-xs-18 col-sm-12 col-md-12  general-dentistry">
	<div class="container ">
		<div class="page-header">
			<h2>General Dentistry</h2>
		</div>
		<div id="slideshow" class="col-xs-18 col-sm-6 col-md-6">

			<a href="${pageContext.request.contextPath}/smileGallery"><h4
					id="smile-gallery-title">Smile Gallery</h4></a>
			<div class="col-md-6 col-sm-6 col-xs-18  image">

				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/PhillipsGale.jpg" />" />
				</a>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/GorbyDiane.jpg" />" />
				</a>

			</div>

			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/CurtisLinsey.jpg" />" />
				</a>

			</div>
			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/CarmelitaRigg.jpg" />" />
				</a>

			</div>

			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/Lim Rachel.jpg" />" />
				</a>

			</div>
			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/LongEdie.jpg" />" />
				</a>

			</div>
			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/WisleyDebbie.jpg" />" />
				</a>

			</div>
			<div class="col-md-6 col-sm-6 col-xs-18  image">
				<a href="${pageContext.request.contextPath}/smileGallery"> <img
					src="<c:url value="/resources/images/patient/smile/small/CliffordTim.jpg" />" />
				</a>

			</div>


		</div>
		<div class="col-xs-18 col-sm-6 col-md-6">


			<a
				href="${pageContext.request.contextPath}/smileGallery#before-after"><h4>Before
					& After</h4></a>

			<div class="row">
				<div class="col-xs-18 col-md-6 col-sm-12">

					<a
						href="${pageContext.request.contextPath}/smileGallery#before-after"
						class="thumbnail"> <img
						src="<c:url value="/resources/images/patient/before-after/small/Lynn Baites-before.jpg" />" />
					</a>
				</div>
				<div class="col-xs-18 col-md-6 col-sm-12">

					<a
						href="${pageContext.request.contextPath}/smileGallery#before-after"
						class="thumbnail"> <img
						src="<c:url value="/resources/images/patient/before-after/small/Lynn Baites-after2.jpg" />" />
					</a>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-18 col-md-6 col-sm-6">

					<a
						href="${pageContext.request.contextPath}/smileGallery#before-after"
						class="thumbnail"> <img
						src="<c:url value="/resources/images/patient/before-after/small/Sarina King-BEFORE.jpg" />" />
					</a>
				</div>
				<div class="col-xs-18 col-md-6 col-sm-6">

					<a
						href="${pageContext.request.contextPath}/smileGallery#before-after"
						class="thumbnail"> <img
						src="<c:url value="/resources/images/patient/before-after/small/Sarina King-AFTER.jpg" />" />
					</a>
				</div>
			</div>
		</div>


	</div>
</div>
<div class="promotion col-xs-18 col-sm-12 col-md-12">
	<div class="promotion-container">
		<div class="col-xs-18 col-sm-12 col-md-6">
			<img class="media-promotion"
				src="<c:url value="/resources/images/about/drLimProfile.jpg"/>"
				alt="Image">

		</div>
		<div class="col-xs-18 col-sm-12 col-md-6 promotion-text">
			<h2 class="promotion-title">We'll Provide You With A Winning
				Smile and Life!</h2>
			<p>For years, we have provided Tulsa and Owasso, Oklahoma
				patients with the latest in high quality dentistry and cosmetic
				services. Our philosophy of care is personalized dentistry, and we
				believe in creating beautiful smiles through artistic and passionate
				dental work. Cosmetic dentist Dr. Heng L. Lim and his staff are
				attentive, caring and friendly. If you are considering making an
				investment in your smile, Dr. Lim offers personalized, high-tech
				dental smile design in a state-of-the-art facility to ensure your
				smile makeover results are second to none. We believe each
				experience should exceed your expectations, and we cater to our
				patients with spa and comfort services. We're not like any cosmetic
				dentist office you've ever visited before!</p>
			<a href="${pageContext.request.contextPath}/about/hengLim"><button
					type="button" class="btn btn-info">About Dr. Lim</button></a>
		</div>
		<div>
			<p>If you are interested in the smile design services we provide,
				including dental bonding, orthodontics (Invisalign), teeth
				whitening, tooth implants, and porcelain veneers, please request a
				Confidential Smile Consultation.</p>
			<h2>Nervous about visiting the cosmetic dentist?</h2>
			<p>
				We offer <a href="<c:url value="/oral-conscious-sedation"/>">Sedation
					Dentistry</a> to help anxious patients relax during treatment.
			</p>
			<p>
				For an amazingly brighter and more captive smile, trust the Elite
				Dental Group that's helped hundreds. Call or email Dr. Lim today for
				your confidential smile <a
					href="<c:url value="/contact#request-form"/>">consultation</a>.
			</p>
		</div>
	</div>
</div>
<button type="button" class="btn btn-primary btn-lg hide"
	data-toggle="modal" data-target="#myModal" id="btnDialog"></button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Thank You</h4>
			</div>
			<div class="modal-body">We are so grate heard from you.</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<!--   <button type="button" class="btn btn-primary">Save changes</button> -->
			</div>
		</div>
	</div>
</div>
<script type="text/javascript"
	src='<c:url value="/resources/js/body/home.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/body/form_request_controller.js"/>'></script>
