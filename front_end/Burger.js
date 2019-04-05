import React, {Component} from 'react';


class burger extends Component {

    render() {
        return (
            <div>
                <p>Nr. {this.props.info.id} {this.props.info.name} with {this.props.info.ingredient} </p>

            </div>
        );
    }
}

export default burger;

