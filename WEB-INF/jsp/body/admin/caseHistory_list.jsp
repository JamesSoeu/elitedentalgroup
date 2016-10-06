<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="serviceList-wraper">
	<div class="page-header col-xs-18 col-sm-12 col-md-12">
		<div class="col-md-6 col-sm-6 col-xs-18">
		<!-- 	<h4>Services List:</h4> -->
		</div>
		<div class="col-md-6 col-sm-6 col-xs-18">
			<button type="button" class="btn btn-default" id="btnAdd"
				data-toggle="tooltip" data-placement="top" title="Add New">
				<img src="<c:url value="/resources/images/icon/plus.png"/>" />
			</button>
		</div>

	</div>
	<table id="tblCaseHistory" class="table table-hover table-inverse">
		<colgroup>
		</colgroup>
		<thead>
			<tr class="">
				<th>Action</th>
				<th>Case History's Id</th>
				<th>Case History's Title</th>
			</tr>
		</thead>
		<tbody>
			<tr class="caseHistory-item  hide">
				<td scope="row"><button type="button" class="btn btn-default"
						id="btnEdit" data-toggle="tooltip" data-placement="top"
						title="Edit">
						<img src="<c:url value="/resources/images/icon/pencil.png"/>" />
					</button> |
					<!-- <button type="button" class="btn btn-secondary" id="btnDelete"
						data-toggle="tooltip" data-placement="top" title="Delete">

					</button> -->
					<button class="btn btn-default btnDelete" data-href="" 
						data-toggle="modal" data-target="#confirm-delete">
						<img src="<c:url value="/resources/images/icon/delete.png"/>" />
					</button></td>
				<td id="caseHistoryId"></td>
				<td id="caseHistoryTitle"></td>
			</tr>


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
<div class="modal fade" id="confirm-delete" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="myModalLabel">Confirm Delete</h4>
			</div>

			<div class="modal-body">
				<p>Do you want to proceed?</p>
				<p class="debug-url"></p>
			</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
				<a class="btn btn-danger btn-ok">Delete</a>
			</div>
		</div>
	</div>
</div>


<script type="text/javascript"
	src='<c:url value="/resources/js/admin/caseHistory_list.js"/>'></script>
