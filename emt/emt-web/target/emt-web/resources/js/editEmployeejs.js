/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//$(document).ready(function(){
//                var items = [
//                    { Name: "Apple", Price: "80", Quantity : "3", Total : "240" },
//                    { Name: "Orance", Price: "50", Quantity : "4", Total : "200" },
//                    { Name: "Banana", Price: "20", Quantity : "8", Total : "160" },
//                    { Name: "Cherry", Price: "250", Quantity : "10", Total : "2500" }
//                ];
//
//                $( "#itemTemplate" ).tmpl( items ).appendTo( "#itemList tbody" );
//            });



//$(document).ready(function () {
//    $('#country').change(function () {
//        var $country = $("select#country").val();
//        $.get('ActionServlet', {countryname: $country}, function (responseJson) {
//            var $select = $('#states');
//            $select.find('option').remove();
//            $.each(responseJson, function (key, value) {
//                $('<option>').val(key).text(value).appendTo($select);
//            });
//        });
//    });
//});
$(document).ready(refreshTable());
function refreshTable() {
    var $empTable = $('#emptable');
    $.post('ViewServlet', function (responseJson) {
        $empTable.find("tr:gt(0)").remove();
//            console.log(JSON.stringify(responseJson));
//        var obj = JSON.parse(responseJson);
//        console.log(obj[0]["Name"]);
        $.each(responseJson, function (key, value) {
            
            var tBody = $('#tablebody');
            var rowNew = $("<tr class='clickable-row' id=" + value['id']+ "><td></td><td></td><td></td><td></td><td></td></tr>");
            rowNew.children().eq(0).text(value['id']);
            rowNew.children().eq(1).text(value['name']);
            rowNew.children().eq(2).text(value['password']);
            rowNew.children().eq(3).text(value['email']);
            rowNew.children().eq(4).text(value['country']);
            rowNew.appendTo(tBody);
        });
    });
    
  //  var table = $('#emptable').DataTable();
 
//$(".clickable-row").on( 'click','tr',  function () {
//    console.log( );
//} );

//$(#id).blur()
//$('#id').focus(function(event){
//     console.log("inside focus");
//
//    $('#id').blur(blurID());
//     console.log("after blurID");
//
//});
//function blurID(){
//    console.log("inside blurID");
//    
//    var $id = document.getElementById("id").value();
//    console.log($id);
//    $.post('EditServlet',{id:$id},function(responseJson){
//        document.getElementById("#ename").value(value['name']);
//    })
//}

$(document).ready(function() {
        $('#id').change(function(event) {  
        var $ID=$("#id").val();
           $.post('EditServlet',{countryname:$ID},function(responseJson) {   
            var $select = $('#ename');                           
               $select.text("");    
               var $select1 = $('#epassword');                           
               $select1.text("");
               var $select2 = $('#eemail');                           
               $select2.text("");
               var $select3 = $('#country');                           
               $select3.text("");
               $.each(responseJson, function(key, value) {               
                   $select.text(value['name']);     
                     $select1.text(value['password']);     
                       $select2.text(value['email']);     
                         $select3.text(value['country']);     
                    });
            });
        });
    });          
}