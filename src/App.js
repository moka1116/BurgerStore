import React, {Component} from 'react';
import Burger from "./Burger"


class App extends Component {

    state =
        {
            data: [],
            name: "kamil"
        };

    componentDidMount() {
        fetch('http://localhost:8080/api/burgers/all')
            .then(response => response.json())
            .then(data => {
                console.log(data);
                this.setState({data})
            })

    };


    render() {
        return (
            <div>
                {this.state.data.map(burger => <Burger info={burger}/>)}
            </div>
        );
    }
}

export default App;
