const Test = () => {
    const json = '{"user1":"John","user2":"Kate","user3":"Peter"}';
    const map = new Map(Object.entries(JSON.parse(json)));
    console.log(map);
}
