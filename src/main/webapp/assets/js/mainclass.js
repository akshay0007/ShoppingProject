$(function () {
    switch (menu) {
        case 'home':
            $('.home').addClass('active');
            break
        case 'about':
            $('.about').addClass('active');
            break;
        case 'service':
            $('.service').addClass('active');
            break;
        case 'contact':
            $('.contact').addClass('active');
            break;
    }

    // to takle against csrf token

    var token=$('meta[name="_csrf"]').attr('content');
    var header=$('meta[name="_csrf_header"]').attr('content');

    if(token.length>0&& header.length>0){
        $(document).ajax(function(e,xhr,options){
            xhr.setRequestHeader(header,token);
        });
    }


    var $loginForm = $('#loginForm');
    if ($loginForm.length) {
        $loginForm.validate({
            rules: {
                username: {
                    required: true,
                    email: true
                },
                password: {
                    required: true
                }

            },
            message: {
                username: {
                    required: "please enter username",
                    email: "please enter valid email address"
                },
                password: {
                    required: "please enter password",
                }


            },
            errorElement: 'em',
            errorPlacement: function (error, element) {
                error.addClass('help-block');
                error.insertAfter(element);
            }
        })
    }

});

