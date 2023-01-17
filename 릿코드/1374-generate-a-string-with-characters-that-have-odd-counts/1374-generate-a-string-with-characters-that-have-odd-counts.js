/**
 * @param {number} n
 * @return {string}
 */
const generateTheString = (n) => {
    const randomAlphabet = () => String.fromCharCode(Math.floor(Math.random() * (122 - 97)) + 97);
    const map = {};
    for(let i=0; i<n; i++) {
        const a = randomAlphabet();
        map[a] = map[a] == null ? 1 : map[a]+1;
    }

    const array = Object.keys(map).filter(key => map[key] % 2 != 0);

    let count = n - array.length;
    if(count != 0) {
        while(true) {
            const a = randomAlphabet();
            if(array.indexOf(a) == -1) {
                if(count % 2 == 0) {
                    for(let i=0; i<count-1; i++) array.push(a);
                    count = 1;
                    continue;
                }
                array.push(a);
                break;
            }
        }
    }
    return array.join("");
}