<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form id="defaultForm" method="POST" class="form-horizontal"
	action="<c:url value="/api/blog"/>" enctype="multipart/form-data">
	<div class="request-form-horizontal-wraper blog-form">
		<div class="blog-form-wraper container">
			<div class="row">
				<div class="page-header col-xs-18 col-sm-12 col-md-12">
					<h3>Please, Input Blog Information</h3>
				</div>
			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Blog Title:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">
					<input type="text" name="blogTitle" id="blog-title"
						class="form-control" />
				</div>

			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Select File:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">
					<input id="media" type="file" class="file form-control" name="media" />
				</div>


			</div>


			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Blog Sub-Content:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">

					<textarea rows="5" cols="50" name="blogSubContent"
						class="form-control" id="blog-sub-content"></textarea>
				</div>


			</div>
			<div class="row  form-group">
				<div class="col-md-3 col-sm-3 col-xs-9">
					<span class="label control-label">Blog Content:</span>
				</div>
				<div class="col-md-9 col-sm-9 col-xs-9">

					<textarea name="blogContent" class="form-control" id="blogContent"></textarea>
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
	src='<c:url value="/resources/js/admin/blog_form.js"/>'></script>