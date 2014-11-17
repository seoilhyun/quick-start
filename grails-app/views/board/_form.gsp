<%@ page import="sample.Board" %>



<div class="fieldcontain ${hasErrors(bean: boardInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="board.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${boardInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: boardInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="board.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="content" required="" value="${boardInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: boardInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="board.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${sample.User.list()}" optionKey="id" required="" value="${boardInstance?.user?.id}" class="many-to-one"/>

</div>

