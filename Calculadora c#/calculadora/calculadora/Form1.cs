using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace calculadora
{
    public partial class Form1 : Form

    {
        double primero;
        double segundo;
        string operador;

        public Form1()
        {
            InitializeComponent();
        }
        clases.suma obj = new clases.suma();
        clases.resta obj2 = new clases.resta();
        clases.multiplicacion obj3 = new clases.multiplicacion();
        clases.div obj4 = new clases.div();


        private void Button1_Click(object sender, EventArgs e)
        {
            operador = "+";
            primero = double.Parse(textBox1.Text);
            textBox1.Clear();

        }

        private void Button16_Click(object sender, EventArgs e)
        {
            segundo = double.Parse(textBox1.Text);
            double sum;
            double res;
            double mul;
            double divi;
            switch (operador) {
                case "+":
                    sum = obj.sumar((primero),(segundo));
                    textBox1.Text = sum.ToString();
                    break;
                case "-":
                    res = obj2.restar((primero), (segundo));
                    textBox1.Text = res.ToString();
                    break;
                case "*":
                    mul= obj3.mul((primero), (segundo));
                    textBox1.Text = mul.ToString();
                    break;
                case "/":
                    divi = obj4.divi((primero), (segundo));
                    textBox1.Text = divi.ToString();
                    break;

            }
        }

        private void Button5_Click(object sender, EventArgs e)
        {
            textBox1.Text= textBox1.Text+"0";
        }

        private void Button4_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "1";
        }

        private void Button7_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "2";
        }

        private void Button12_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "3";
        }

        private void Button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "4";
        }

        private void Button8_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "5";
        }

        private void Button13_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "6";
        }

        private void Button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "7";
        }

        private void Button9_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "8";
        }

        private void Button14_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "9";
        }

        private void Button10_Click(object sender, EventArgs e)
        {
            operador = "-";
            primero = double.Parse(textBox1.Text);
            textBox1.Clear();

        }

        private void Button15_Click(object sender, EventArgs e)
        {
            operador = "*";
            primero = double.Parse(textBox1.Text);
            textBox1.Clear();

        }

        private void Button20_Click(object sender, EventArgs e)
        {
            operador = "/";
            primero = double.Parse(textBox1.Text);
            textBox1.Clear();

        }

        private void Button11_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + ".";
        }

        private void Button19_Click(object sender, EventArgs e)
        {
            textBox1.Text =  " ";
        }
    }
}
