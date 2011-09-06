$(document).ready(function() {
	//google code prettyfier
    prettyPrint();

	//ascensor
$('#content').ascensor({
	AscensorName:'persona',
	WindowsFocus:true,
	WindowsOn:0,
	
	NavigationDirection:'xy',
	Direction: 'y',
	Navig:true,
	Link:false,
	ReturnURL:true,
	PrevNext:false,
	CSSstyles:true,
	
	KeyArrow:true,
	keySwitch:true,
	ReturnCode:false,
	
	ChocolateAscensor:true,
	AscensorMap: '3|3',
	ContentCoord: '1|1 & 1|2 & 1|3 & 2|3 & 3|3'
});

});
