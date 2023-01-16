/**
 * @param {string} key
 * @param {string} message
 * @return {string}
 */
const decodeMessage = (key, message) => {
    const map = {" " : " "};

    [...new Set(key.split(""))]
        .filter(v => v != " ")
        .forEach((v, i) => map[v] = String.fromCharCode(97 +i));

    return message.split("").map(v => map[v]).join("");
};