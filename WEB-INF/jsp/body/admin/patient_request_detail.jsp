<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class='button'>
	<button id="btnPrint" class="btn btn-default">Print</button>
</div>
<div class="detailPatientsRequest-wraper">
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label">Request's ID:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data" id="lblId"></label>
		</div>
	</div>
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label">Request DateTime:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data" id="lblDateTime"></label>
		</div>
	</div>
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label">Purpose:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data" id="lblPurpose"></label>
		</div>
	</div>
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label">Interested:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data" id="lblInterested"></label>
		</div>
	</div>
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label">Best Time To Contact:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data" id="lblBestTime"></label>
		</div>
	</div>

	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-18">
			<label class="control-label">Person's Information:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-18 person-Info">
			<div class="row field">
				<div class="col-md-6 col-xs-18 col-sm-12">
					<label class="control-label col-md-6 col-xs-18 col-sm-6">First Name: </label> <label
						class="control-label data col-md-6 col-xs-18 col-sm-6" id="lblFirstName"></label>
				</div>
				<div class="col-md-6 col-xs-18 col-sm-12" >
					<label class="control-label col-md-6 col-xs-18 col-sm-6">Last Name: </label> <label
						class="control-label data col-md-6 col-xs-18 col-sm-6" id="lblLastName"></label>
				</div>
			</div>
			<div class="row field">
				<div class="col-md-6 col-xs-18 col-sm-12">
					<label class="control-label col-md-6 col-xs-18 col-sm-6">Phone Number: </label> <label
						class="control-label data col-md-6 col-xs-18 col-sm-6" id="lblPhone"></label>
				</div>
				<div class="col-md-6 col-xs-18 col-sm-12">
					<label class="control-label col-md-6 col-xs-18 col-sm-6">Email Address: </label> <label
						class="control-label data col-md-6 col-xs-18 col-sm-6" id="lblEmail"></label>
				</div>
			</div>
		</div>
	</div>
	<div class="row field">
		<div class="col-md-4 col-sm-4 col-xs-6">
			<label class="control-label col-md-6 col-xs-18 col-sm-6">Message:</label>
		</div>
		<div class="col-md-8 col-sm-8 col-xs-6">
			<label class="control-label data col-md-6 col-xs-18 col-sm-6" id="lblMessage"></label>
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
			<div class="modal-body">We are so grate hear from you.</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript"
	src='<c:url value="/resources/js/admin/patient_request_detial.js"/>'></script>