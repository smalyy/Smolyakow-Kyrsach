function calcul() {
	var form = document.forms["calculation"],
	height = form["height"].value,
	width = form["width"].value,
	depth = form["depth"].value,
	type = form['type'].value,
	name = form["name"].value;
	if(type == "Window") {
		document.getElementById("price").textContent = ((height * width) * (depth / 75556.75)).toFixed(2);
		document.getElementById("hidenPrice").value = document.getElementById("price").textContent;
	}
		else {
			document.getElementById("price").textContent = ((height * width) * (depth / 12297.95)).toFixed(2);
			document.getElementById("hidenPrice").value = document.getElementById("price").textContent;
		}
}