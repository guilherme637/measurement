let unitFrom = document.getElementById('unitFrom');
let unitTo = document.getElementById('unitTo');

unitFrom.addEventListener('change', function (e) {
    let options = document.querySelectorAll('#unitTo option');

    options.forEach(option => {
        option.hidden = false;

        if (option.value === e.target.value) {
            option.hidden = true;
            unitTo.value = unitTo.querySelector('option[selected]');
        }
    });
});