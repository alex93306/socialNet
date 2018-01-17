<html>
<head>
    <style>
        .modal {
            width: 200px;
            height: 200px;
            position: absolute;
            z-index: 2;
            background-color: gray;
        }
        body {
            background-color: white;
        }
    </style>
</head>

<body>
<table width="1">
    <thead>
        <tr>
            <th>id</th>
            <th>email</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${user.id}</td>
            <td>${user.email}</td>
        </tr>
    </tbody>
</table>
<button type="button" onclick="showPopup()" >Create new User</button>
<script>
    function showPopup() {
        var modal = document.createElement('div');
        modal.className  = 'modal';
        var modalHeader = document.createElement('div');
        modalHeader.innerHTML = '<strong>Hello</strong>, Alex';
        modal.appendChild(modalHeader);
        document.body.appendChild(modal);
    }
</script>
</body>
</html>
