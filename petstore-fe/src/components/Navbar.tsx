import { HStack, Image } from "@chakra-ui/react";
import logo from "../assets/logo.png";

const Navbar = () => {
  return (
    <HStack padding="10px">
      <Image src={logo} boxSize="60px" borderRadius={50} />
    </HStack>
  );
};

export default Navbar;
