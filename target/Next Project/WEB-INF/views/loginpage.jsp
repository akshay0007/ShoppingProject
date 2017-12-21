<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div class="col-md-offset-2 col-md-8">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4>product mgt</h4>
        </div>
    </div>

    <div class="panel-body">
        <sf:form class="form-horizontal" modelAttribute="mproduct">
            <div class="form-group">
                <label class="control-label col-md-4">
                    enter panel data
                </label>
                <div class="colo-md-8">
                    <sf:input type="text" path="name" placeholder="product name" class="form-control"/>
                    <sf:errors path="name" cssClass="help-block" element="em"/>
                </div>

            </div>

            <div class="form-group">
                <label class="control-label col-md-4">
                    enter panel data
                </label>
                <div class="colo-md-8">
                    <sf:input type="text" path="brand" placeholder="product name" class="form-control"/>
                    <sf:errors path="brand" cssClass="help-block" element="em"/>
                </div>

            </div>

            <div class="form-group">
                <label class="control-label col-md-4">
                    enter panel data
                </label>
                <div class="colo-md-8">
                    <sf:input type="text" path="description" placeholder="product name" class="form-control"/>
                    <sf:errors path="description" cssClass="help-block" element="em"/>
                </div>

            </div>

            <%--  <div class="form-group">
                  <label class="control-label col-md-4">
                      enter panel categories
                  </label>
                  <div class="colo-md-8">
                      <sf:select class="form-control" path="categoryId" placeholder="product categoryId"
                                 items="${categories}"
                                 itemlabel="name"
                                 itemValue="id"/>

                      <em class="help-block">please enter desciption name</em>
                  </div>

              </div>--%>


            <div class="form-group">
                <div class="col-md-offset-4-colo-md-8">
                    <input type="submit" name="submit" id="submit"
                           class="btn btn-primary"/>
                </div>
                <sf:hidden path="id"/>
                <sf:hidden path="code"/>
                <sf:hidden path="unitPrice"/>
                <sf:hidden path="quantity"/>
                <sf:hidden path="active"/>
                <sf:hidden path="supplierId"/>
                <sf:hidden path="purchases"/>
                <sf:hidden path="views"/>

            </div>

        </sf:form>
    </div>

</div>