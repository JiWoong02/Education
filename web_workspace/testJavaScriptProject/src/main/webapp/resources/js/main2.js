/**
 * main2.js
 * 2024-02-27 developer
 */

 function showAlert(){
	 window.alert('메세지만 출력하는 알림창 입니다.');
 }
  function showConfirm(){
	 //var returnValue = window.confirm('찬성하면 확인, 반대하면 취소를 누르세요.');
	 var returnValue = confirm('찬성하면 확인, 반대하면 취소를 누르세요.');
	 document.getElementById('result1').innerHTML = '리턴값 : ' + returnValue;
	 
	 
 }
  function showPrompt(){
	  //var address = prompt('주소를 입력하세요.');
	  var address = window.prompt('주소를 입력하세요.');
	  document.getElementById('result2').innerHTML = '리턴된 주소 : ' + address;
 }
 
 function inputValue(){
	 //input 태그에 기록된 값을 읽어올 때 value 속성 사용함
	 var userName = document.getElementById('username').value;
	 var address = document.getElementById('address').value;
	 
	 alert('이름 : ' + userName + '\n' + '주소 : ' + address);
	 
	 
	 return false;	//submit 이벤트 취소 처리함 => 전송 안 함
	 //return true; //submit 이벤트 실행 => 전송보냄
 }
 
 function calculator2(op){
	 //input 을 통해 입력들어오는 값은 모두 string 임
	 //숫자를 문자로 바꾸려면 string => number 파싱해야 함
	 //내장함수에 parseInt(), parseDouble(), Number() 사용할 수 있음
	 var num1 = Number(document.getElementById('n1').value);
	 //var num2 = parseInt(document.getElementById('n2').value);
	 var num2 = Number(document.getElementById('n2').value);
	 
	 var result;
	 
	 switch(op){
		 case '+' : result = num1 + num2;	break;
		 case '-' : result = num1 - num2;	break;
		 case '*' : result = num1 * num2;	break;
		 case '/' : result = num1 / num2;	break;
		 case '%' : result = num1 % num2;	 
	 }
	 document.getElementById('calc').innerHTML = num1 + ' ' + op + ' ' + num2 + ' = ' + result;
 }
 function equalCheck(){
	 alert('== 연산자 : ' + ("" == false) + ', ' +
	 							   ("" == 0) + ', ' +
	 							   (0 == false) + ', ' + 
	 							   ('273' == 273) + '\n ' +
	 		'=== 연산자 : ' + ("" === false) + ', ' +
	 							   ("" === 0) + ', ' +
	 							   (0 === false) + ', ' + 
	 							   ('273' === 273));
 }
 
 function switchCheck(){
	 var today = new Date();
	 var currentHour = today.getHours();
	 console.log(today);
	 console.log("현재시간 : "+currentHour);
	 
	 //case 에 조건식을 사용할 때는 switch(true)
	 switch(true){
		 case currentHour == 9: alert('근무시작 시간입니다.'); break;
		 case currentHour == 11: alert('오전 휴식 시간입니다.'); break;
		 case currentHour == 12: alert('점심시간입니다.'); break;
		 case currentHour > 18: alert('퇴근하세요.'); break; 
		 default : alert("자! 화이팅합시다.")
	 }
 }
 
 function logicCheck(){
	 var value = Number(window.prompt('숫자를 입력하세요.'));
	 //짧은 조건문 : || 는 앞이 거짓이면 뒤를 실행함, &&는 앞이 참이면 뒤를 실행함
	 value % 2 == 0 || alert('홀수입니다.');
	 value % 2 == 0 && alert('짝수입니다.');
 }
 
 