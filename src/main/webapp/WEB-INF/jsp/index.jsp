<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<my:layout>
    <jsp:attribute name="body">

<div class="row">
    <div class="col-md-12">

        <dl class="dl-horizontal">
            <dt>token</dt>
            <dd>${token}</dd>

            <dt>Actor</dt>
            <dd>${perunPrincipal.actor}</dd>

            <dt>First name</dt>
            <dd>${perunPrincipal.user.firstName}</dd>
            <dt>Last name</dt>
            <dd>${perunPrincipal.user.lastName}</dd>

            <dt>Mail</dt>
            <dd>${perunPrincipal.additionalInformations.mail}</dd>
            <dt>Organization</dt>
            <dd>${perunPrincipal.additionalInformations.o}</dd>
        </dl>


    </div>
</div>

    </jsp:attribute>
</my:layout>