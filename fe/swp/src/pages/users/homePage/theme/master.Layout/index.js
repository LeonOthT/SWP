import React from 'react'; // Add the missing import statement for React
import { memo } from 'react';
import Header from '../header';
import Footer from '../footer';


const MasterLayout = ({children, ...props}) => {
    return (
        <div {...props}>
            <Header />
            {children}
            <Footer />
        </div>
    );
    
};

export default memo(MasterLayout);