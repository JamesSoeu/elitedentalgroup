<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="defaultForm" method="POST" class="form-horizontal"
	action="<c:url value="/api/caseHistory"/>"
	enctype="multipart/form-data">
	<div class="request-form-horizontal-wraper blog-form">
		<div class="blog-form-wraper container">
			<div class="row">
				<div class="page-header col-xs-18 col-sm-12 col-md-12">
					<h3>Please, Input Case History Information</h3>
				</div>
			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Case History Title:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">
					<input type="text" name="caseHistoryTitle" id="caseHistory-title"
						class="form-control" />
				</div>

			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Select Patient:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">
					<!-- <input id="media" type="file" class="file" name="media" /> -->
					<select name="patient" id="patient"
						class="form-control combobox">
						
					</select>
				</div>


			</div>
			
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Video Link:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">
					<input type="text" name="videoLink" id="videoLink"
						class="form-control" />
				</div>


			</div>


			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Case History Sub-Content:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">

					<textarea rows="5" cols="50" name="caseHistorySubContent"
						class="form-control" id="caseHistory-sub-content"></textarea>
				</div>


			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Case History Content:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">

					<textarea name="caseHistoryContent" class="form-control" id="caseHistoryContent"></textarea>
				</div>

			</div>
			<div class="row col-xs-18 col-sm-12 col-md-12 submit form-group">
				<button type="submit" class="btn btn-primary" id="btn-submit">Submit</button>
			</div>
		</div>
	</div>
</form>
<div class="form-group col-xs-18 col-sm-12 col-md-12 form-element">

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
	src='<c:url value="/resources/js/ckeditor/ckeditor.js"/>'></script>
<script>
	
</script>

<script type="text/javascript"
	src='<c:url value="/resources/js/admin/case_history_form.js"/>'></script>