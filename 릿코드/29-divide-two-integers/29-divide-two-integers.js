/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
const divide = (dividend, divisor) => {
    let result;
    const divNum = dividend/divisor;
    if(Math.abs(divNum) >= Math.pow(2, 31)) {
        if(divNum > 0) {
            result = Math.pow(2, 31) - 1;
        } else {
            result = Math.pow(2,31) * -1;
        }
    } else {
        result = Number(String(divNum).split(".")[0]);
    }
    return result;
};