<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="JavaScript" type="text/javascript">
	function floor(number) {
		return Math.floor(number * Math.pow(10, 2)) / Math.pow(10, 2);
	}

	function dosum() {
		var mi = document.temps.IR.value / 1200;
		var base = 1;
		var mbase = 1 + mi;
		for (i = 0; i < document.temps.YR.value * 12; i++) {
			base = base * mbase
		}
		document.temps.PI.value = floor(document.temps.LA.value * mi
				/ (1 - (1 / base)))
		document.temps.MT.value = floor(document.temps.AT.value / 12)
		document.temps.MI.value = floor(document.temps.AI.value / 12)
		var dasum = document.temps.LA.value * mi / (1 - (1 / base))
				+ document.temps.AT.value / 12 + document.temps.AI.value / 12;
		document.temps.MP.value = floor(dasum);
	}
	$(function() {
		$(':input[type=text]').on('keyup',function(){
			dosum();
			/* alert("hello"); */
		});
	});
</script>
</head>
<body>
	<h1 class="pageTitle">PITI Calculator</h1>

	<h4>(Principal, Interest, Taxes & Insurance)</h4>
	<p>When lenders underwrite your loan, they calculate your insurance
		and property taxes as if they were paid monthly. This calculator does
		the same thing. Of course, you may have to mentally add mortgage
		insurance, if required, and Homeowner's Association Fees.</p>

	<center>
		<div class="col-xs-18 col-sm-12 col-md-12">
			<form name="temps">
			<h3>Input Your Data Here</h3>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<span class="label control-label">Years:</span> 
						<input type="text" name="YR" SIZE="6" VALUE="30" class="form-control" />
					</div>
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<span class="label control-label">Interest Rate:</span> 
						<input type="text" name="IR" SIZE="6" VALUE="9.5" class="form-control" />
					</div>
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<span class="label control-label">Loan Amount:</span> 
						<input type="text" name="LA" SIZE="6" VALUE="100000" class="form-control" />
					</div>
				</div>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<span class="label control-label">Annual Tax:</span> 
						<input type="text" name="AT" SIZE="6" VALUE="1000" class="form-control" />
					</div>
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<span class="label control-label">Annual Insurance:</span> 
						<input type="text" name="AI" SIZE="6" VALUE="300" class="form-control" />
					</div>
					<div class="form-group form-element col-xs-18 col-sm-4 col-md-4">
						<INPUT TYPE="BUTTON" class="btn btn-primary" id="btnCalculation"
							VALUE="Calculate Now!" onClick="dosum()"  class="form-control" >
					
					</div>
				</div>
				
				<!-- <table cellpadding="2" cellspacing="0" border="3" width="530"
					style="font-family: arial; font-size: 12px; font-weight: bold; color: #000;">
					<tr>
						<td>Years: <INPUT TYPE="TEXT" NAME="YR" onChange="dosum()"
							SIZE="6" VALUE="30"></td>
						<td>Interest Rate: <INPUT TYPE="TEXT" NAME="IR"
							onChange="dosum()" SIZE="6" VALUE="6.5"></td>
						<td>Loan Amount: <INPUT TYPE="TEXT" NAME="LA"
							onChange="dosum()" SIZE="6" VALUE="100000"></td>
					</tr>
					<tr>
						<td>Annual Tax: <INPUT TYPE="TEXT" NAME="AT"
							onChange="dosum()" SIZE="6" VALUE="1000"></td>
						<td>Annual Insurance: <INPUT TYPE="TEXT" NAME="AI"
							onChange="dosum()" SIZE="6" VALUE="300"></td>
						<td align="center"></td>
					</tr>
				</table>
 -->
 			<div id="monthlyPaymentResult">
				<h3>Monthly Payment Results</h3>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<span class="label control-label">Principal Interest:</span> 
						
					</div>
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<input type="text" name="PI" SIZE="10" class="form-control" />
					</div>
					
				</div>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<span class="label control-label">Property Taxes:</span> 
						
					</div>
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<input type="text" name="MT" SIZE="10" class="form-control" />
					</div>
					
				</div>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<span class="label control-label">Homeowners Insurance:</span> 
						
					</div>
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<input type="text" name="MI" SIZE="10" class="form-control" />
					</div>
					
				</div>
				<div class="col-xs-18 col-sm-12 col-md-12 row">
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<span class="label control-label">Total PITI Payment:</span> 
						
					</div>
					<div class="form-group form-element col-xs-18 col-sm-6 col-md-6">
						<input type="text" name="MP" SIZE="10" class="form-control" />
					</div>
					
				</div>
				</div>
				
				<!-- <table cellpadding="3" cellspacing="0" border="3"
					style="font-family: arial; font-size: 12px; font-weight: bold; color: #000;"> -->
				<!-- 	<tr>
						<td>Principal &amp; Interest</td>
						<td><INPUT TYPE="TEXT" NAME="PI" SIZE="10" class="form-control" ></td>
					</tr> -->
					<tr>
				<!-- 		<td>Property Taxes</td>
						<td><INPUT TYPE="TEXT" NAME="MT" SIZE="10" class="form-control" ></td>
					</tr> -->
				<!-- 	<tr>
						<td>Homeowners Insurance&nbsp;</td>
						<td><INPUT TYPE="TEXT" NAME="MI" SIZE="10" class="form-control" ></td>
					</tr> -->
					<!-- <tr>
						<td>Total PITI Payment</td>
						<td><INPUT TYPE="TEXT" NAME="MP" SIZE="10" class="form-control" ></td>
					</tr> -->
			<!-- 	</table> -->
			</form>
		</div>
	</center>
</body>
</html>