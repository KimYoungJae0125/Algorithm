/**
 * @param {number} num
 * @return {number}
 */
const addDigits = (num) => {
    while(String(num).length > 1) {
        num = String(num).split("").reduce((x, y) => Number(x)+Number(y));
    }
    return num;
}