<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="home">
                    <a href="${contextRoot}/home">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="about">
                    <a href="${contextRoot}/about">About</a>
                </li>
                <li class="service">
                    <a href="${contextRoot}/service">Services</a>
                </li>
                <li class="contact">
                    <a href="${contextRoot}/contact">Contact</a>
                </li>

                <li class="dropdown">
                    <a href="javascript:void(0)"
                       class="btn btn-default dropdown-toggle"
                       id="dropdownMenu1"
                       data-toggle="dropdown">
                        fullname
                        <span class="caret"/>
                    </a>
                </li>

                <ul class="dropdown-menu">
                    <li>
                        <a href="${contextRoot}/cart">
                            <span class="glyphicon glyphicon-shopping-cart"/>
                            <span class="badge">0</span>
                            0.0
                        </a>
                    </li>
                    <li class="divder" role="separator"/>
                    <li>
                        <a href="${contextRoot}/logout">logout</a>
                    </li>

                </ul>
            </ul>
        </div>
    </div>
</nav>
