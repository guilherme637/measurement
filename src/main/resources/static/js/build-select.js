let selectFrom = document.getElementById('unitFrom');
let selectTo = document.getElementById('unitTo');

let tabs = document.getElementById('tab-convert');

populateSelect(options()['button-length'], selectFrom, selectTo);

tabs.addEventListener('click', function (e) {
    selectFrom.replaceChildren();
    selectTo.replaceChildren();

    defineTab(e.target.id)
    populateSelect(options()[e.target.id], selectFrom, selectTo);
})

function defineTab(id) {
    document.querySelector('#tab-convert button.active')?.classList.remove('active');
    document.getElementById(id).classList.add('active');
}

function createOption(options, selected = false) {
    let newOption = document.createElement('option');
    newOption.value = options;
    newOption.text = options;
    newOption.selected = selected;

    return newOption;
}

function populateSelect(options, selectFrom, selectTo) {
    selectFrom.appendChild(createOption('SELECT FROM'), true);
    selectTo.appendChild(createOption('SELECT TO'), true);

    for (let key in options) {
        let optionFrom = createOption(options[key]);
        let optionTo = createOption(options[key]);

        selectFrom.appendChild(optionFrom);
        selectTo.appendChild(optionTo);
    }
}

function options() {
    return {
        "button-length": {
            0: "Millimeter",
            1: "Centimeter",
            2: "Meter",
            3: "Kilometer",
            4: "Inch",
            5: "Foot",
            6: "Yard",
            7: "Mile"
        },
        "button-weight": {
            0: "Milligram",
            1: "Gram",
            2: "Kilogram",
            3: "Ounce",
            4: "Pound"
        },
        "button-temperature": {
            0: "Celsius",
            1: "Fahrenheit",
            2: "Kelvin"
        }
    }
}