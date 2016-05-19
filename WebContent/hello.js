$(document).ready(function() {
    $.ajax({
        //url: "http://rest-service.guides.spring.io/greeting"
    	//url: "http://localhost:8080/greeting"
    	url: "http://m.lowes.com/IntegrationServices/resources/productList/json/v3_0/4294857975?langId=-1&storeId=10702&catalogId=10051&nValue=4294857975&storeNumber=0595&pageSize=20&firstRecord=0&refinements=5003703"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
});