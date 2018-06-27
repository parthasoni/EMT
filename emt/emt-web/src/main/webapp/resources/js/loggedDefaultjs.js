/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//  function myFunction() {
//     var status = '${statusID}';
//     if(status)
// }
//function myFunction() {
//    console.log('inside myFunction() body');
//    var status = '${statusID}';
//    console.log(status);
//    if (status != '0') {
//  console.log('inside if body');
//        myFunction2();
//    }
//  console.log('inside myFunction().. just called myFunction2().. existing myFunction()');
//}


function myFunction2() {
    console.log('inside myFunction2() body');
    $(document).ready(function () {
   console.log('inside myFunction2() body when document loaded');
        var x = document.getElementById("snackbar");
        x.className = "show";
        setTimeout(function () {
            x.className = x.className.replace("show", "");
        }, 3000);
  console.log('inside myFunction2().. existing myFunction2()');

    });
}
//$(document).ready(function () {
//    $("#logout").click(function () {
//        $.post("LogouServlet");
//    });
//});