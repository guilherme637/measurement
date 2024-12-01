document.getElementById('reset-button').addEventListener('click', function () {
    let result = document.getElementById('div-result');
    let unit = document.getElementById('unit');

    if (result.style.display === 'none') {
        document.getElementById('unit').style.display = "none";
        document.getElementById('div-result').style.display = "block"

        return;
    }

    if (unit.style.display === 'none') {
        document.getElementById('unit').style.display = "block";
        document.getElementById('div-result').style.display = "none"
    }
})