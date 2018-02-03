<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

hello now is ${contents}
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>分类ID</th>
            <th>标题</th>
            <th>二级标题</th>
            <th>标题描述</th>
            <th>图片1</th>
            <th>图片2</th>
            <th>内容</th>
        </tr>

    </thead>

    <tbody>
    <#list contents as content>
       <tr>
           <th> ${content.id}</th>
           <th>${content.categoryId}</th>
           <th>${content.title}</th>
           <th>${content.subTitle}</th>
           <th>${content.titleDesc}</th>
           <th>${content.pic}</th>
           <th>${content.pic1}</th>
           <th>${content.content}</th>
       </tr>
    </#list>
    </tbody>
</table>

</body>
</html>