function getAllTickets() {
    $.ajax({
        type: "GET",
        url: "/api/tickets",
        contentType: "json",
        dataType: "json",
        success: function (data) {
            $.each(data, function (key, value) {
                    var jsonData = JSON.stringify(value);
                    //Parse JSON
                    var objData = $.parseJSON(jsonData);
                    var description = objData.description;
                    var price = objData.price;
                    var quantity = objData.quantity;
                    var subTotal = objData.subTotal;
                    $('<tr><td>' + description + '</td><td>' + price +
                        '</td><td>' + quantity + '</td><td>'+ subTotal+'</td></tr>').
                    appendTo('#tickets');
                }
            );
        },
        error: function (xhr) {
            alert(xhr.responseText); //Angular, Backbone,...
        }
    });
}