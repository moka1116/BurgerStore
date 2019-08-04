import React, {Component} from 'react';
import Burgers from './components/Burgers';

class App extends Component {

    state = {
        burgers: []
    };

    componentDidMount() {
        fetch('http://localhost:8080/burgers')
            .then(res => res.json())
            .then((data) => {
                this.setState({burgers: data})
            })
            .catch(console.log)
    }

    render() {
        return (
            <Burgers burgers={this.state.burgers}/>
        )
    }
}

export default App;