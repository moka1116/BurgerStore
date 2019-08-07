import React from 'react'

const Burgers = ({burgers}) => {
    return (
        <div>
            <center><h1><strong>Burger List</strong></h1></center>
            {burgers.map((burger) => (
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">{burger.id}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">{burger.name}</h6>
                        <p class="card-text">{burger.info}</p>
                    </div>
                </div>
            ))}
        </div>
    )
};

export default Burgers