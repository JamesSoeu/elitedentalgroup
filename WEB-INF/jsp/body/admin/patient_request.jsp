<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/resources/css/datepicker/datepicker.css" />"
	rel="stylesheet">

<script type="text/javascript"
	src='<c:url value="/resources/js/datepicker/bootstrap-datepicker.js"/>'></script>

<div class="patientsRequest-wraper">
	<div class="page-header col-xs-18 col-sm-12 col-md-12">
		<div class="col-md-12">
			<h4>Please, Chose one's Option:</h4>
		</div>
		<div class="container">
			<div class="radio">
				<label> <input type="radio" name="optionsRadios"
					class="options" id="rdoToday" value="1" checked>Today
				</label>
			</div>
			<div class="radio">
				<label> <input type="radio" name="optionsRadios"
					class="options" id="rdoBetween" value="2">Between
				</label>
				<div class="row between-div-option hide">

					<div class='col-md-3 form-group'>
						<label class="control-label">Start Date:</label><input type="text"
							name="startDate" id="startDate" data-date-format="mm/dd/yyyy"
							class="datepicker form-control">
					</div>
					<div class='col-md-3 form-group'>
						<label class="control-label">End Date:</label> <input type="text"
							name="endDate" id="endDate" data-date-format="mm/dd/yyyy"
							class="datepicker form-control">
					</div>
					<!-- <div class='col-md-3 button'>
					<button id="btnSearch" class="btn btn-default">Search</button>
				</div>
				<div class='col-md-3 button'>
					<button id="btnPrint" class="btn btn-default">Print</button>
				</div> -->
					<script type="text/javascript">
						$(function() {
							$('.datepicker').datepicker();
						});
					</script>
				</div>
			</div>
			<div>
				<button id="btnSubmit" class="btn btn-default">Submit</button>
			</div>
			<div class='col-md-3 button-print'>
				<button id="btnPrint" class="btn btn-default">Print</button>
			</div>
		</div>
	</div>
	<table id="tblPatientsRequest" class="table table-hover">
		<colgroup>
		</colgroup>
		<thead>
			<tr>
				<!-- <th class="hide">Request's Id</th> -->
				<th>Patient's Name</th>
				<th>Purpose</th>
				<th>Interest</th>
				<th>Phone</th>
				<th>DateTime</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>

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
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript"
	src='<c:url value="/resources/js/admin/patient_request.js"/>'></script>
