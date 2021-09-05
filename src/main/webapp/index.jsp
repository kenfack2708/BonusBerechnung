<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bonusberechnung</title>
</head>
<body>
<body>
	<h1>Bonusberechnung</h1>
	<form action="bonusServlet" method="post">
<div class="form_content clearfix">
		<div class="form-group">
			<label for="Vorname">Vorname</label>
			<span><input class="is_required validate account_input form-control" type="vorname" data-validate="vorname" id="vorname" name="yourName" value=""></span>
		</div>
		<div class="form-group">
			<label for="Jahr">Zugehörigkeit</label>
			<span><input class="is_required validate account_input form-control" type="Jahr" data-validate="Jahr" id="Jahr" name="Jahr" value=""></span>
		</div>
		<div class="form-group">
			<label for="Gehalt">Gehalt</label>
			<span><input class="is_required validate account_input form-control" type="Gehalt" data-validate="Gehalt" id="Gehalt" name="Gehalt" value=""></span>
		</div>
		<p class="submit">
			<input type="hidden" class="hidden" name="back" value="my-account">						<button type="submit" id="Bonusberechnen" name="Bonusberechnen" class="button btn btn-default button-medium">
				<span>
					<i class="icon-lock left"></i>
					Bonus berechnen
				</span>
			</button>
		</p>
	</div>

	</form>
</body>
</body>
</html>