
	 var defaultColor="black";
	    var overColor="blue";
	    var clickColor="pink";
	    var chooseRow=9999;
	    function over_color(obj){
	        if(obj.style.backgroundColor!=clickColor)
	            obj.style.backgroundColor=overColor;
	    }
	    function remove_color(obj){
	        if(obj.style.backgroundColor!=clickColor)
	            obj.style.backgroundColor=defaultColor;
	    }
	    function click_color(obj){
	        var tb=obj.parentNode;//获得父节点对象
	        if(chooseRow!=9999){
	            var lastObj=tb.rows[chooseRow];
	            lastObj.style.backgroundColor=defaultColor;
	        }
	        chooseRow=obj.rowIndex;//获得当前行在表格中的序数
	        obj.style.backgroundColor=clickColor;
	        var cells_num = document.getElementById("lab").rows.item(chooseRow).cells[2];
	        
	    }
	    
	    
	    function downloadClick(fid){
	    	window.location.href="<%=basePath%>download.action?fid="+fid; 
	    }