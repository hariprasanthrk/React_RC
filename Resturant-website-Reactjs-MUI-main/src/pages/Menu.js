import React from "react";
import { MenuList } from "../data/data";
import Layout from "./../components/Layout/Layout";
import {
  Box,
  Card,
  CardActionArea,
  CardContent,
  CardMedia,
  Grid,
  Typography,
  Button,
} from "@mui/material";

const Menu = () => {
  const handleOrder = (itemName) => {
    // Add your logic for handling the order here
    console.log(`Ordered: ${itemName}`);
  };

  return (
    <Layout>
      <Grid container spacing={2} justifyContent="center">
        {MenuList.map((menu) => (
          <Grid item key={menu.name} xs={12} sm={6} md={4} lg={3}>
            <Card sx={{ maxWidth: "980px", display: "flex", flexDirection: "column" }}>
              <CardActionArea>
                <CardMedia
                  sx={{ minHeight: "200px", flexGrow: 1 }}
                  component={"img"}
                  src={menu.image}
                  alt={menu.name}
                />
                <CardContent>
                  <Typography variant="h5" gutterBottom component={"div"}>
                    {menu.name}
                  </Typography>
                  <Typography variant="body2">{menu.description}</Typography>
                </CardContent>
              </CardActionArea>
              <Button onClick={() => handleOrder(menu.name)} variant="contained">
                Order
              </Button>
            </Card>
          </Grid>
        ))}
      </Grid>
    </Layout>
  );
};

export default Menu;
